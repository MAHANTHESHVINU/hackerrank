def print_odd_even_pattern(n=1, max_n=9):
	"""Recursively print odd numbers while going deeper and
	even numbers while returning (unwinding) from recursion.

	For default range 1..9 the output will be:
	1 3 5 7 9 8 6 4 2
	"""
	if n > max_n:
		return

	if n % 2 == 1:
		# odd: print while going deeper
		print(n, end=" ")
		print_odd_even_pattern(n + 1, max_n)
	else:
		# even: recurse first, then print while coming back
		print_odd_even_pattern(n + 1, max_n)
		print(n, end=" ")


if __name__ == "__main__":
	# default behaviour prints the requested sequence
	print_odd_even_pattern()
	print()

