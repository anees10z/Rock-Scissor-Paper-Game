import random

print("\n               By Md Anees Khan...........")
"""
               computer-->
             snake[0]   water[1]    gun[2]
user^
snake[0]     draw         win       loose

water[1]     loose        draw       win   

gun[2]        win         loose      draw

"""

l = [0, 1, 2]
comp = random.choice(l)
result = [["DRAW", "WIN", "LOOSE"], ["LOOSE", "DRAW", "WIN"],
          ["WIN", "LOOSE", "DRAW"]]

print("\n\n---------- Snake --- Water --- Gun ----------\n")

print("       0 = Snake   1 = Water   2 = Gun   \n")

user = int(input("Enter an option:"))
if user in l:
  print("\n", result[user][comp])
else:
  print("\nEnter a valid choice")

# if you want to see computer choice other wise comment these 2 lines below
if user in l:
  print("\ncomputer choice: ",comp)
