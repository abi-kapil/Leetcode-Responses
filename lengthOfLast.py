def lengthOfLastWord(s):
    s = s.strip()
    array = s.split(' ')

    return (len(array[len(array)- 1]))



print(lengthOfLastWord('   fly me   to   the moon  '))