#!/bin/bash
sudo su
yum install httpd -y
yum update -y
aws s3 cp s3://jbarrybucket/index.html /var/www/html/
service httpd start
chkconfig httpd on

yum remove java-1.7.0

cd ~
wget --no-cookies --no-check-certificate --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/8u45-b14/jdk-8u45-linux-x64.rpm"

yum localinstall jdk-8u45-linux-x64.rpm

rm -f ~/jdk-8u45-linux-x64.rpm

echo "export JAVA_HOME="/usr/java/jdk1.8.0_45"" >> ~/.bashrc
echo "export JRE_HOME="/usr/java/jdk1.8.0_45/jre"" >> ~/.bashrc

cd /opt
wget  http://mirror.cogentco.com/pub/apache/tomcat/tomcat-8/v8.5.4/bin/apache-tomcat-8.5.4.tar.gz
tar xzf apache-tomcat-8.5.4.tar.gz
rm -f apache-tomcat-8.5.4.tar.gz
mv apache-tomcat-8.5.4 tomcat8
echo "export CATALINA_HOME="/opt/tomcat8"" >> ~/.bashrc
source ~/.bashrc
cd /opt/tomcat8
./bin/startup.sh

--yum install tomcat8-webapps tomcat8-admin-webapps