from activities.CONFEST import num_list


def test_sum(num_list):
    sum = 0
    for n in num_list:
        sum += n
    assert sum == 55