#!/bin/sh

#1 get information
project=$(grep -E "rootProject.name" settings.gradle.kts | awk -F "\"" '{print $2}')
version=$(awk -F '=' '/version\s*=\s*[0-9.]*/ {gsub(/^ +| +$/,"",$2); print $2}' gradle.properties)

#2 clean build service
./gradlew clean build

#3 create docker images
docker build -t $project:$version .

#4 start docker images with spring profile and cleanup after use
docker run --rm --name $project -p 5000:8080 -e "SPRING_PROFILES_ACTIVE=docker" $project:$version
