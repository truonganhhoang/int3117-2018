"""
unit test year_max_population function
"""

import unittest
import year_max_pop

class TestYearMaxPop(unittest.TestCase):
    def test_values(self):
        people = [[1900, 1988], [1932, 2000], [1957, 1957],
		  [1956, 1999], [1935, 1945], [1920, 1944],
		  [1998, 2000]]

        self.assertEqual(year_max_pop.YearMaxPopulation.get_year_max_population(people, 1900, 2000), 1935)

if __name__ == "__main__":
    unittest.main()
