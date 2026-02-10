def factorial(n):
    """Retourne la factorielle de n"""
    if n < 0:
        raise ValueError("Le nombre doit être positif")
    if n == 0 or n == 1:
        return 1
    return n * factorial(n - 1)

if __name__ == "__main__":
    n = int(input("Entrez un nombre : "))
    print(f"La factorielle de {n} est {factorial(n)}")
