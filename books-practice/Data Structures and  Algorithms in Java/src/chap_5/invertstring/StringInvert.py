def invertir(s:str):
    if s == "":
        return s
    return invertir(s[1:]) + s[0]