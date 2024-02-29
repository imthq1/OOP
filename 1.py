from math import isqrt 
    
    def is_special(n):
        if n < 4:
            return True
        if n % 4 == 0 :
            return False

        for i in range(3,isqrt(n), 2):
            if n % (i*i) == 0:
                return False

        return True 
