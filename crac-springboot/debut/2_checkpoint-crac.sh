#!/bin/bash

echo "   _____ _____        _____             _____ _    _ ______ _____ _  _______   ____ _____ _   _ _______ "
echo "  / ____|  __ \      / ____|           / ____| |  | |  ____/ ____| |/ /  __ \ / __ \_   _| \ | |__   __|"
echo " | |    | |__) |__ _| |       ______  | |    | |__| | |__ | |    | ' /| |__) | |  | || | |  \| |  | |   "
echo " | |    |  _  // _\` | |      |______| | |    |  __  |  __|| |    |  < |  ___/| |  | || | | . \` |  | |   "
echo " | |____| | \ \ (_| | |____           | |____| |  | | |___| |____| . \| |    | |__| || |_| |\  |  | |   "
echo "  \_____|_|  \_\__,_|\_____|           \_____|_|  |_|______\_____|_|\_\_|     \____/_____|_| \_|  |_|   "
echo "                                                                                                        "

# https://www.coolgenerator.com/ascii-text-generator (Big)

if [ "$JAVA_HOME" == "" ]; then
  echo "Vous devez définir la variable JAVA_HOME"
  exit -1;
fi

ARCHIVE=`ls target/*.jar | cut -d'/' -f2`

echo "$JAVA_HOME/bin/jcmd target/$ARCHIVE JDK.checkpoint"
$JAVA_HOME/bin/jcmd target/$ARCHIVE JDK.checkpoint
