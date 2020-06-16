#!/usr/bin/env bash


mkdir production

cd production

echo 'we are in clone';
sshpass -p admin002   sudo rm  -rf  radical-lib-model
git clone https://abiola2:oyeniran002@github.com/africa-prudential/radical-lib-model.git
cd radical-lib-model
git checkout master
ls -al
sshpass -p admin002   sudo mvn clean install -U
