#!/bin/bash

echo "   _____ _____        _____            _____  ______  _____ _______      _    _ _____  ______ "
echo "  / ____|  __ \      / ____|          |  __ \|  ____|/ ____|__   __|/\  | |  | |  __ \|  ____|"
echo " | |    | |__) |__ _| |       ______  | |__) | |__  | (___    | |  /  \ | |  | | |__) | |__   "
echo " | |    |  _  // _\` | |      |______| |  _  /|  __|  \___ \   | | / /\ \| |  | |  _  /|  __|  "
echo " | |____| | \ \ (_| | |____           | | \ \| |____ ____) |  | |/ ____ \ |__| | | \ \| |____ "
echo "  \_____|_|  \_\__,_|\_____|          |_|  \_\______|_____/   |_/_/    \_\____/|_|  \_\______|"
echo "                                                                                              "
                                                                                              
if [ "$JAVA_HOME" == "" ]; then
  echo "Vous devez définir la variable JAVA_HOME"
  exit -1;
fi

ARCHIVE=`ls target/*.jar | cut -d'/' -f2`

echo "$JAVA_HOME/bin/java -XX:CRaCRestoreFrom=/tmp/crac-files/springboot"
$JAVA_HOME/bin/java -XX:CRaCRestoreFrom=/tmp/crac-files/springboot
