all: MiniPython.g4
	antlr4 MiniPython.g4
	./compile.sh

test: all
	echo "These should pass:"
	./grun.sh MiniPython evalfile testfiles/a.py
	./grun.sh MiniPython evalfile testfiles/b.py
	./grun.sh MiniPython evalfile testfiles/c.py
	./grun.sh MiniPython evalfile testfiles/d.py
	./grun.sh MiniPython evalfile testfiles/e.py
	./grun.sh MiniPython evalfile testfiles/f.py
	./grun.sh MiniPython evalfile testfiles/g.py
	./grun.sh MiniPython evalfile testfiles/h.py
	./grun.sh MiniPython evalfile testfiles/i.py
	./grun.sh MiniPython evalfile testfiles/j.py
	echo "These should fail:"
	./grun.sh MiniPython evalfile testfiles/a-error.py
	./grun.sh MiniPython evalfile testfiles/b-error.py
	./grun.sh MiniPython evalfile testfiles/c-error.py
	./grun.sh MiniPython evalfile testfiles/d-error.py
	./grun.sh MiniPython evalfile testfiles/e-error.py
	./grun.sh MiniPython evalfile testfiles/f-error.py
	./grun.sh MiniPython evalfile testfiles/g-error.py
	./grun.sh MiniPython evalfile testfiles/h-error.py
	./grun.sh MiniPython evalfile testfiles/i-error.py
	./grun.sh MiniPython evalfile testfiles/j-error.py
