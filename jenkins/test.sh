#!/usr/bin/env bash

if [ -d "/home/jenkins/tomove/production-lib-model" ] 
then
    cd /home/jenkins/tomove/production-lib-model
    git config --global user.name "abiola2"
    git config --global user.email "abiola.oyedemi@africaprudential.com"
    git remote remove origin
    git remote add  origin https://abiola2:oyeniran002@github.com/africa-prudential/production-lib-model.git
    git fetch --all
    git checkout staging
    unzip -o ../lib_model_patched.zip -d /home/jenkins/tomove/production-lib-model
    git add -A
    git commit -a -m  "automated commit on `date +'%Y-%m-%d %H:%M:%S'`"
    git push origin staging
else
    cd /home/jenkins/tomove
    git clone git@github.com:africa-prudential/production-lib-model.git
    cd production-lib-model
    git config --global user.name "abiola2"
    git config --global user.email "abiola.oyedemi@africaprudential.com"
    git remote remove origin
    git remote add  origin https://abiola2:oyeniran002@github.com/africa-prudential/production-lib-model.git
    git fetch --all
    git checkout staging
    unzip -o ../lib_model_patched.zip -d /home/jenkins/tomove/production-lib-model
    git add -A
    git commit -a -m  "automated commit on `date +'%Y-%m-%d %H:%M:%S'`"
    git push origin staging
fi