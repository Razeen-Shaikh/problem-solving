S = input()
s = S

def toggle(s):
    toggle = ""
    for i in range(0, len(s)-1):
        if (s[i] >= 65 and s[i] <= 90):
               toggle.append(s[i].lower())
        if (s[i] >= 97 and s[i] <= 122):
            toggle.append(s[i].upper())
    return toggle

print(toggle(s));
