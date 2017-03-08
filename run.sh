#!/usr/bin/env bash 
java -Xms4g -Xmx4g -Xloggc:gc.out -server -XX:-TieredCompilation -Xbatch \
     -jar target/uberjar/keirin-demo-0.1.0-SNAPSHOT-standalone.jar
