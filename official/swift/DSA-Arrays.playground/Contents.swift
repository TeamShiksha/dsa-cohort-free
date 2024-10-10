import UIKit

var greeting = "Hello, playground"

// Q1: Wave Print Array - https://www.interviewbit.com/problems/wave-array/

func wave(_ A: inout [Int]) -> [Int] {
    A.sort()
    for i in stride(from: 0, through: A.count - 2, by: 2) {
        let temp = A[i]
        A[i] = A[i+1]
        A[i+1] = temp
    }
    return A
}

var waveArr = [1,2,3,4]
print(wave(&waveArr))


//Q2: Max Min Sum - https://www.interviewbit.com/problems/max-min-05542f2f-69aa-4253-9cc7-84eb7bf739c4/

func solve(_ A: inout [Int]) -> Int {
    var max = A[0]
    var min = A[0]
    for ele in A {
        if ele > max {
            max = ele
        }
        if ele < min {
            min = ele
        }
    }
    
    return max+min
}

var maxMinArr = [-2, 1, -4, 5, 3]
print(solve(&maxMinArr))

//MARK: Homework

// Q3: https://www.interviewbit.com/problems/occurence-of-each-number/
func findOccurences(_ A: inout [Int]) -> [Int] {
    var freqDict: [Int: Int] = [:]
    var res: [Int] = []
    for ele in A {
        freqDict[ele, default: 0] += 1
    }
    
    res =  freqDict.sorted { $0.key < $1.key }.map { $0.value }
    return res
}

var arr = [4,3,3]
print(findOccurences(&arr))

// Q4: https://www.interviewbit.com/problems/hotel-bookings-possible/

func hotelBookings(arrival: inout [Int], departure: inout [Int], count: Int) -> Bool {
    var sum = 0
    var i = 0
    var j = 0
    var n = arrival.count
    
    // When we sort arrival and departure independently, the idea is to process each event (either an arrival or a departure) in chronological order. Since we're only comparing the earliest arrival to the earliest departure, it doesn't matter which specific guest arrives or departs—you only need to know whether more guests are arriving than departing on each day.
    arrival.sort()
    departure.sort()
    
    while (i < n && j < n) {
        if arrival[i] <= departure[j] {
            sum += 1
            i += 1
        } else {
            sum -= 1
            j += 1
        }
        
        if sum > count {
            print(sum)
            return false
        }
    }
    
    return true
}

var arrival = [5,14,9,20,6]
var depature = [23,19,32,12,9]
hotelBookings(arrival: &arrival, departure: &depature, count: 3)

// Q5: https://www.interviewbit.com/problems/max-sum-contiguous-subarray/

func maxSubArray(_ A: [Int]) -> Int {
    var maxSum = Int.min
    var sum = 0
    for ele in A {
        sum += ele
        if sum > maxSum {
            maxSum = sum
        }
        
        if sum < 0 {
            sum = 0
        }
    }
    
    return maxSum
}

maxSubArray([-2, 1, -3, 4, -1, 2, 1, -5, 4])

// Q6: https://www.interviewbit.com/problems/rotate-matrix/
func rotate(_ matrix: inout [[Int]]) {
    let rowCount = matrix.count - 1
    let columnCount = matrix[0].count - 1
    
    for row in 0...rowCount {
        for col in 0...columnCount {
            if row < col {
                let temp = matrix[row][col]
                matrix[row][col] = matrix[col][row]
                matrix[col][row] = temp
            }
        }
    }
    
    for row in 0...rowCount {
        for col in 0...columnCount/2 {
            let temp = matrix[row][col]
            matrix[row][col] = matrix[row][columnCount - col]
            matrix[row][columnCount - col] = temp
        }
    }
}

var rotateArr = [[1,2,3], [4,5,6], [7,8,9]]
rotate(&rotateArr)
print(rotateArr)

