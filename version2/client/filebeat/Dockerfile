FROM centos
 
RUN yum update -y && rpm --import https://packages.elastic.co/GPG-KEY-elasticsearch
COPY resources/elastic.repo  /etc/yum.repos.d/
RUN yum install -y filebeat
COPY resources/filebeat.yml /etc/filebeat/filebeat.yml
 
WORKDIR /etc/filebeat

CMD ["filebeat", "-e", "-c", "/etc/filebeat/filebeat.yml"]