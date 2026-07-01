#*******************************
#Arrays / Lists in Python
#*******************************

def arrays_demo():
    fruits = ['apple', 'banana', 'cherry', 'date']
    print("First fruit:", fruits[0])  # Output: apple
    fruits.append('elderberry')
    print("Fruits after appending:", fruits)
    fruits[1] = 'blueberry'
    print("Fruits after modification:", fruits)
    fruits.remove('cherry')
    print("Fruits after removal:", fruits)
    print("Total number of fruits:", len(fruits))
    fruits.pop()
    print("Fruits after popping last element:", fruits)
    print("Sliced fruits:", fruits[1:3])  # Slicing
    print("Reversed fruits:", fruits[::-1])  # Reversing
    print("Last fruit:", fruits[-1])  # Negative indexing
    print("Sorted fruits:", sorted(fruits))  # Sorted copy

    for fruit in fruits:
        print("Fruit:", fruit)


#**********************************
# Hash Maps / Dictionaries in Python
#**********************************

def dictionaries_demo():
    student_scores = {
        "Alice": 85,
        "Bob": 92,
        "Charlie": 78,
        "David": 90
    }

    print("Student Scores:", student_scores['David'])  # Output: 90
    student_scores['Bobby'] = 88
    print("Updated Student Scores:", student_scores)

    student_scores['Bob'] = 95
    print("Final Student Scores:", student_scores)

    if 'Charlie' in student_scores:
        print("Charlie's score is:", student_scores['Charlie'])

    del student_scores['Alice']
    print("Scores after removing Alice:", student_scores)

    for student, score in student_scores.items():
        print(f"{student}: {score}")
    print("All Students:", list(student_scores.keys()))
    print("All Scores:", list(student_scores.values()))
    print("Items:", list(student_scores.items()))
    print("Sorted by student names:", list(sorted(student_scores.items())))

    array_2d = [[k,v] for k,v in student_scores.items()]
    print("2D Array:", array_2d)

# Main menu
print("Select an option:")
print("1. Arrays/Lists")
print("2. Dictionaries")
choice = input("Enter your choice (1 or 2): ")

if choice == '1':
    arrays_demo()
elif choice == '2':
    dictionaries_demo()
else:
    print("Invalid choice!")
