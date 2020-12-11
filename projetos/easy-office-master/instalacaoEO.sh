#!/bin/bash

echo "Obrigado por baixar o Easy Office, vamos agora chegar dependências do uso da aplicação"

echo "Você permite instalarmos a versão do Java, JRE e JDK que nossa aplicação utiliza?(s/n)"

read inst
	if [ \"$inst\" == \"s\" ]
           then
echo "instalando java"
apt-get java 

echo "instalando jdk"
apt install default-jdk

echo "instalando jdk"
apt install default-jre

echo "tudo certo!"
echo "Executando a aplicação..."
java -jar EasyAPP.jar

else 
echo "Você optou por não instalar as dependências, sem elas infelizmente não é posssível continuar, obrigado!"

	fi
