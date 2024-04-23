#!/usr/bin/env bash

set -xe

# login with presidio
aws --profile deploy --region us-east-1 ecr get-login-password |
  docker login -u AWS --password-stdin 190066226418.dkr.ecr.us-east-1.amazonaws.com

aws ecr get-login-password |
  docker login \
  --username AWS \
  --password-stdin \
  883127560329.dkr.ecr.us-west-2.amazonaws.com