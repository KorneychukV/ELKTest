FROM centos

RUN yum install -y postfix postfix-perl-scripts mailx python3-pip
RUN pip3 install --upgrade pip && pip3 install j2cli && pip3 install j2cli[yaml]
ADD ./resources/main.cf /etc/postfix/main.cf
RUN j2 /etc/postfix/main.cf
 
WORKDIR /etc/postfix
 
CMD ["/usr/sbin/postfix", "-c", "/etc/postfix", "start"]