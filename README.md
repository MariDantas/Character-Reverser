# Character Reverser
This program receives two sets of characters that will not necessarily have the same number of elements. After storing them in the variables, there's an if statement that verifies which of them is the bigger one, because its size it's going to be used as the limit of the iteration. Then, it makes a reverse for to reverse the second set and store it in another variable. Next, we have a for that uses the size of the bigger set for the iteration, joining the characters in one single variable.

There needs to have some care here because since the sets will not always have the same size, I had to consider that in my code. Thus, I created some ifs to determine if the sizes of both sets are still greater than the current value of the **i** variable. If they are, I can still store the characters of both sets one after another, because it means that both sets are within bounds. However, if one of them reached this limit, I can't store any more of this set, because there are no other characters to process. Therefore, I have to keep storing the characters of the bigger set until it reaches the end of the loop.

Finally, I use another for to go through the result set to determine how many numbers and how many other characters there are. To do so, I put an if inside asking if the current character being analyzed is a digit. If it is, the variable **qtNum** gets incremented. If not, then I can only assume it's another character, so I can increment the variable **qtChar**. After that, I can display the results.
