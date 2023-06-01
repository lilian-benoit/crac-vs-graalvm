#!/bin/bash

# https://www.coolgenerator.com/ascii-text-generator
# Big
echo "   _____ _____        _____                     _____  _____  "
echo "  / ____|  __ \      / ____|              /\   |  __ \|  __ \ "
echo " | |    | |__) |__ _| |       ______     /  \  | |__) | |__) |"
echo " | |    |  _  // _\` | |      |______|   / /\ \ |  ___/|  ___/ "
echo " | |____| | \ \ (_| | |____            / ____ \| |    | |     "
echo "  \_____|_|  \_\__,_|\_____|          /_/    \_\_|    |_|     "
echo "                                                              "
                                                              
if [ "$JAVA_HOME" == "" ]; then
  echo "Vous devez définir la variable JAVA_HOME"
  exit -1;
fi

mkdir /tmp/crac-files

ARCHIVE=`ls target/*.jar | cut -d'/' -f2`

echo "$JAVA_HOME/bin/java -XX:CRaCCheckpointTo=/tmp/crac-files/jetty -jar target/$ARCHIVE"
$JAVA_HOME/bin/java -XX:CRaCCheckpointTo=/tmp/crac-files/jetty -jar target/$ARCHIVE
