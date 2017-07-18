import os

fileNames = os.listdir("/Users/prinks/Downloads/Dummy")

for i in fileNames:
    print i

def removeDigits(fileName):
    newFileName = []
    for i in fileName:
        if not i.isdigit():
            newFileName.append(i)
    return ''.join(newFileName)

for i in fileNames:
    newFileName = removeDigits(i)
    print newFileName