from termcolor import colored

text = 'left foot right foot left foot right. Feet in the day, feet at night.'
l1 = ['foot', 'feet']
for t in text.lower().split():
    if t in l1:
        print(colored(t, 'white', 'on_red'))
    else: print(t)