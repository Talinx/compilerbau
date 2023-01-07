#!/bin/bash
COUNT_FAILED=0
echo "These should pass:"
for f in testfiles/*.py		
do
	echo "$f" | grep "error" > /dev/null
	EXIT_STATUS=$?
	if [[ EXIT_STATUS -ne 0 ]]
	then
		LINES_OUT=`sh ./grun.sh MiniPython startfile $f 2>&1 | wc -l`
		if [[ LINES_OUT -eq 0 ]]
		then
			echo ✓ $f
		else
			echo ✗ $f
			COUNT_FAILED=$((COUNT_FAILED + 1))
		fi
	fi
done
echo "These should fail:"
for f in testfiles/*.py		
do
	echo "$f" | grep "error" > /dev/null
	EXIT_STATUS=$?
	if [[ EXIT_STATUS -eq 0 ]]
	then
		LINES_OUT=`./grun.sh MiniPython startfile $f 2>&1 | wc -l`
		if [[ LINES_OUT -ne 0 ]]
		then
			echo ✓ $f
		else
			echo ✗ $f
			COUNT_FAILED=$((COUNT_FAILED + 1))
		fi
	fi
done
if [[ COUNT_FAILED -eq 0 ]]
then
	echo "All tests passed"
else
	echo "$COUNT_FAILED tests failed"
	exit 1
fi
