#!/usr/bin/python3
import os
import sys
os.system("youtube-dl -o '~/Downloads/%(title)s' "+sys.argv[1]+" --recode-video 'mp4'")

##
