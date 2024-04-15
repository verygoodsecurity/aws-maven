#!/usr/bin/env bash

mkdir -p ~/.m2

cat << EOF > ~/.m2/settings.xml
<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
      http://maven.apache.org/xsd/settings-1.0.0.xsd">
    <mirrors>
        <mirror>
            <id>repo1</id>
            <mirrorOf>central</mirrorOf>
            <name>Maven Central</name>
            <url>https://repo1.maven.org/maven2/</url>
        </mirror>
        <mirror>
            <id>repo2</id>
            <mirrorOf>central</mirrorOf>
            <name>Maven Central 2</name>
            <url>https://repo2.maven.org/maven2/</url>
        </mirror>
    </mirrors>
    <servers>
        <server>
            <id>github</id>
            <username>$GITHUB_USERNAME</username>
            <password>$GITHUB_TOKEN</password>
        </server>
    </servers>
</settings>
EOF
