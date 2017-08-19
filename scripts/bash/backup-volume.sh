#!/bin/bash

FILE_NAME=$1
VOLUME_PATH=$2
FILE_NAME="$FILE_NAME-$(date +%d%m%Y).tar.gz"

echo "tar -czvf $FILE_NAME $VOLUME_PATH"
