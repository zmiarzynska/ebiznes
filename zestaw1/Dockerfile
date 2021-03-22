FROM ubuntu:18.04

ENV TZ=Europe/Warsaw
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

#JAVA
RUN apt-get update && apt-get upgrade -y &&\
	apt-get install -y software-properties-common &&\
	add-apt-repository ppa:openjdk-r/ppa &&\
	apt-get update &&\
	apt-get -y install vim git wget zip curl gnupg2 openjdk-8-jdk

ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64
ENV PATH $JAVA_HOME/bin:$PATH

#SCALA 
RUN wget https://downloads.lightbend.com/scala/2.12.13/scala-2.12.13.deb &&\
	dpkg -i scala-2.12.13.deb &&\
	apt-get update &&\
	apt-get install scala


#SBT
RUN echo "deb https://dl.bintray.com/sbt/debian /" | tee -a /etc/apt/sources.list.d/sbt.list &&\
	curl -sL "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x2EE0EA64E40A89B84B2DF73499E82A75642AC823" | apt-key add &&\
	apt-get update &&\
	apt-get install -y sbt 


#NPM
RUN curl -sL https://deb.nodesource.com/setup_12.x | bash -
RUN apt-get install -y nodejs &&\
	npm install npm@latest -g

#REACT
EXPOSE 8000
#PLAY
EXPOSE 9000

RUN useradd -ms /bin/bash zmiarzynska
RUN adduser zmiarzynska sudo

USER zmiarzynska
WORKDIR /home/zmiarzynska
RUN mkdir /home/zmiarzynska/ebiznes/

VOLUME ["/home/zmiarzynska/ebiznes/"]
