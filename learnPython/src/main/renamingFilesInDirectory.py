import os

dir = "/Users/prinks/Downloads/Dummy"

fileNames = os.listdir(dir)
print fileNames

print "Before:"
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
    print dir + "/" + i
    print dir + "/" + newFileName
    os.rename(dir+"/"+i, dir+"/"+newFileName)

