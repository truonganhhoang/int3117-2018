"""
Given a list of people with their birth and end years,
between a specific start year and end year,
find the year with the most number of people alive
"""

import numpy as np

def year_max_population(people, start_year, end_year):
    n_years = end_year - start_year + 1
    pops = np.zeros(n_years)

    for birth, death in people:
        assert birth <= death
        idx = [i-start_year for i in range(birth, death+1)]
        pops[idx] += 1

    return np.argmax(pops) + start_year
