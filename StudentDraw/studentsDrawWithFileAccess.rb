def getArrayFromFile filename
	array = []
	File.open(filename, :encoding => 'UTF-8').each_line do |line|
		next if line.start_with? '#'
		array.push(line)
	end

	return array
end

def setUpStudents filename
	students = getArrayFromFile(filename)
	puts "All students"
	puts students
	studentsNotPresent = getArrayFromFile("notPresent.txt")
	puts "Not present"
	puts studentsNotPresent
	previousWinners = getArrayFromFile("winners.txt")
	puts "Winners"
	puts previousWinners
	puts students[0] == previousWinners[0]
	availableStudents = students - previousWinners - studentsNotPresent
	puts "Available"
	puts availableStudents
	return availableStudents
end

def getStudentToRemoveFrom arrayOfCandidates
	index = rand(arrayOfCandidates.length)
	#puts index
	arrayOfCandidates[index]
end

def displayWinner winner
	puts
	puts
	print "And the winner is..."
	sleep(2)
	puts winner[0]
	puts "Congratulations!!!"
end

def introduceExitementFor availableStudents
	while (availableStudents.length > 1) do
		studentToRemove = getStudentToRemoveFrom availableStudents
		availableStudents -= [studentToRemove]
		print "Eliminating student"
		3.times do
	 		sleep(1)
	 		print ". "
	  		$stdout.flush
		end			
		puts studentToRemove
		sleep(1)
	end
end

if ARGV.length > 0
	availableStudents = setUpStudents(ARGV[0])
	introduceExitementFor(availableStudents)
	winner = availableStudents
	displayWinner(winner)
else
	puts "No input file given"
end