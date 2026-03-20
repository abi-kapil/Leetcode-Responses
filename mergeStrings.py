# def merge (word1, word2):
#     response = [''] * (len(word1) + len(word2))
#     index1, index2 = 0, 0
#     for i in range(len(word1) + len(word2)):
#         if not i % 2 == 0 and index2 < len(word2):
#             response[i] = word2[index2]
#             index2 += 1
#         elif i % 2 == 0 and index1 < len(word1):
#             response[i] = word1[index1]
#             index1 += 1
#         elif len(word1) > len(word2):
#             response[i] = word1[index1]
#             index1 += 1
#         elif len(word1) < len(word2):
#             response[i] = word2[index2]
#             index2 += 1
#     return ''.join(response)


def merge(word1, word2):
    return ''.join(c for pair in zip(word1, word2) for c in pair) + word1[len(word2):] + word2[len(word1):]


# def merge(word1, word2):
#     result = []
#     for c1, c2 in zip(word1, word2):
#         result.append(c1 + c2)
#     return ''.join(result) + word1[len(word2):] + word2[len(word1):]


# def merge1 (word1, word2):
#     return ''.join

   