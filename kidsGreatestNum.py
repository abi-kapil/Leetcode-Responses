def solution(candies, extraCandies):
    maximum = max(candies)
    return [kid + extraCandies >= maximum for kid in candies]


test_arr = [2,3,5,1,3]
extra = 3
print(solution(test_arr, extra))