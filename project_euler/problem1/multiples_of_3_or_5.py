# sum of n nos is n(n+1)/2
# Hence, sum of multiples of 3 is 3n(n-1)/2 and 5 is 5n(n-1)/2.
# Since, there are some numbers that get multiplied by both 3 and 5.
# We are takng lcm of both which is 15 and substracting 15n(n-1)/2.
# if we want to find the multiples < n. where n is 1000 in this case.
# We need to find the upper limit by just divide n-1 by 3, 5, and 15 and taking the floor of the number.
# Considering n = 1000

n = 1000

def sum_of_multiples(n, multiple):
    upper_limit = (n - 1) // multiple
    print(upper_limit)
    sum = multiple * upper_limit * (upper_limit + 1) // 2
    return sum

print(sum_of_multiples(n, 3) + sum_of_multiples(n, 5) - sum_of_multiples(n, 15))
