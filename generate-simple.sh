#!/bin/bash
#
# Shell script para criação de projetos tipo WAR(no-multiprojects).
# Autor: Oto Junior
# Data: 31/12/2013
#
# OBS: MOVER ESTE SCRIPT PARA A PASTA RAIZ DOS PROJETOS.
#
mvn archetype:generate -DarchetypeGroupId=org.otojunior.archetype \
-DarchetypeArtifactId=jee6-app-simple-archetype \
-DarchetypeVersion=1.2 \
-DgroupId=org.otojunior \
-DartifactId=$1 \
-Dversion=1.0-SNAPSHOT \
-Dpackage=org.otojunior.$1 \
-Dmaven.test.skip=true \
-B $2
