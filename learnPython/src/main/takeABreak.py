import time
import webbrowser

def takeABreak():
    print("Time to take a break")
    print("Go out for a walk!")
    print("Listen to some music")
    print("Don't sit in front of the computer for so long!")

millis = int(round(time.time() * 1000))
print millis

#twoHoursInMillis = 2 * 60 * 60 * 1000
twoHoursInMillis = 10
print twoHoursInMillis

currentTimeMillis = millis

webbrowser.open("www.youtube.com")

i = 1

while i <= 10:
    if currentTimeMillis <= (millis+twoHoursInMillis):
        currentTimeMillis = int(round(time.time() * 1000))
        print "currentTimeMillis: ", currentTimeMillis
        print "millis: ", millis
        print "Sum of millis and twoHoursInMillis: ", (millis+twoHoursInMillis)
        time.sleep(2)
    else:
        print "currentTimeMillis: ", currentTimeMillis
        print "millis: ", millis
        takeABreak()
        i = 10
    i += 1

