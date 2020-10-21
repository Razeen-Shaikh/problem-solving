def main(array):
    # Initializing Product to 1
    product = 1
    # Multiplying each element with product
    for element in array:
        product *= element
    return product


# Printing the product
if __name__ == "__main__":
    # Taking input from testcases
    n = int(input())
    array = (map(int, input().split()))
    # Taking modulo of 10^9 + 7
    m = 10**9 + 7
    print(main(array) % m)
