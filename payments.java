#! /bin/bash
var_os='curl -s http://169.254.169.254/latest/meta-data/ami-id'
if [ $var_os == "ami-02e136e9004f3da870" ]
then
sudo su -
yum update -y
yum install httpd git -y
service httpd start
chkconfig httpd on
git clone https://github.com/ARAVINDTrainings/Fram-Freash.git /var/www/html
else
sudo su -
apt update -y
apt install apache2 -y
service start apache2
service enable apache2
rm /var/www/html/index.html
git clone https://github.com/ARAVINDTrainings/amazon.git /var/www/html
fi

