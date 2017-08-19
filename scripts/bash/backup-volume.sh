#!/bin/bash

VOLUME_PATH=$1
FILE_NAME=$2
FILE_NAME="$2-$(date +%d%m%Y).tar.gz"

echo "tar -czvf $FILE_NAME $VOLUME_PATH"
