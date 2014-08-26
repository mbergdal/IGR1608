$winnersFile = "winners.txt"
$notPresentFile = "notPresent.txt"
$studentFile = "studentList2.txt"

def getHashWithStudentsFromFile filename
	students = {}
	File.open(filename, :encoding => 'UTF-8').each_line do |line|
		next if line.start_with? '#'
		parts = line.chomp.split(":")
		students[parts[0]] = parts[1].to_i
	end
	return students
end

def getArrayFromFile filename
	array = []
	File.open(filename, :encoding => 'UTF-8').each_line do |line|
		next if line.start_with? '#'
		array.push(line.chomp)
	end
	return array
end

def setUpStudents filename
	students = getHashWithStudentsFromFile(filename)
	puts "All students: " + students.to_s
	studentsNotPresent = getArrayFromFile($notPresentFile)
	puts "Students not present: " + studentsNotPresent.to_s
	previousWinners = getArrayFromFile($winnersFile)
	puts "Previous winners: " + previousWinners.to_s
	studentsToExclude = previousWinners + studentsNotPresent
	studentsToExclude.each do |student|
		students.delete(student)
	end
	return students
end

def getStudentToRemoveFrom hashOfCandidates
	studentNames = hashOfCandidates.keys
	index = rand(studentNames.length)
	studentToRemove = studentNames[index]
	if (hashOfCandidates[studentToRemove] == 0)
		return studentToRemove
	else
		hashOfCandidates[studentToRemove] -= 1
		return nil
	end
end

def displayWinner winner	
	puts
	print "And the winner is..."
	sleep(2)
	puts winner
	puts "Congratulations!!!"
end

def eliminateStudents availableStudents
	while (availableStudents.length > 1) do
		studentToRemove = getStudentToRemoveFrom availableStudents
		if (studentToRemove == nil)
			next
		end
		availableStudents.delete(studentToRemove)
		print "Eliminating student"
		3.times do
	 		#sleep(1)
	 		print ". "
	  		$stdout.flush
		end			
		puts studentToRemove
		#sleep(1)
	end
	return availableStudents
end

def writeWinnerToFile winner
	file = File.open($winnersFile, 'a', :encoding => 'UTF-8')
	file.puts(winner)
	file.close
end

if ARGV.length > 0
	availableStudents = setUpStudents(ARGV[0])
else
	availableStudents = setUpStudents($studentFile)
end

availableStudents = eliminateStudents(availableStudents)
if availableStudents.length > 0
	winner = availableStudents.shift
	displayWinner(winner[0])
else
	puts "No more student to draw from"
end