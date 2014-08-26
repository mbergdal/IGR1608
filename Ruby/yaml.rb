require 'yaml'

class Student
	def initialize
		@name = "Pelle"
	end
		
	def name
		@name
	end
	
	def setName name
		@name = name
	end
	
	def numberOfClasses
		@numberOfClasses
	end
	
	def setNumberOfClasses number
		@numberOfClasses = number
	end
end

personA = Student.new
personA.setName "Mads"
personA.setNumberOfClasses 2
personB = Student.new

personArray = [personA, personB]

yaml = personArray.to_yaml

File.open("persons.yaml", 'w') do |f|
	f.write(yaml)
end

personsString = File.read("persons.yaml")
	 
newPersonsArray = YAML::load(personsString)
puts newPersonsArray[0].name
puts newPersonsArray[1].name
puts newPersonsArray[1].numberOfClasses
