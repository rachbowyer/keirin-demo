#!/usr/bin/env bash 
java -Xms4g -Xmx4g -Xlog:gc:gc.out -server -XX:-TieredCompilation -Xbatch \
     -jar target/uberjar/keirin-demo-0.1.1-standalone.jar
