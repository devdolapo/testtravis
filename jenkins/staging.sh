#!/usr/bin/env bash


mkdir staging

cd staging


echo 'we are in clone';
sshpass -p admin002   sudo rm  -rf  radical-lib-model
git clone https://abiola2:oyeniran002@github.com/africa-prudential/radical-lib-model.git
cd radical-lib-model
git checkout staging
ls -al
sshpass -p admin002   sudo mvn clean install -U
