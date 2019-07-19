#!/bin/bash

gradle init

cat buildscript >> build.gradle
echo "include ':app'" >> settings.gradle

./gradlew build
./gradlew installDebug
