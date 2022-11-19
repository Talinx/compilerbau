all: MiniPython.g4
	antlr4 MiniPython.g4
	./compile.sh

test: all
	echo "These should pass:"
	./grun.sh MiniPython startfile testfiles/a.py
	./grun.sh MiniPython startfile testfiles/b.py
	./grun.sh MiniPython startfile testfiles/c.py
	./grun.sh MiniPython startfile testfiles/d.py
	./grun.sh MiniPython startfile testfiles/e.py
	./grun.sh MiniPython startfile testfiles/f.py
	./grun.sh MiniPython startfile testfiles/g.py
	./grun.sh MiniPython startfile testfiles/h.py
	./grun.sh MiniPython startfile testfiles/i.py
	./grun.sh MiniPython startfile testfiles/j.py
	echo "These should fail:"
	./grun.sh MiniPython startfile testfiles/a-error.py
	./grun.sh MiniPython startfile testfiles/b-error.py
	./grun.sh MiniPython startfile testfiles/c-error.py
	./grun.sh MiniPython startfile testfiles/d-error.py
	./grun.sh MiniPython startfile testfiles/e-error.py
	./grun.sh MiniPython startfile testfiles/f-error.py
	./grun.sh MiniPython startfile testfiles/g-error.py
	./grun.sh MiniPython startfile testfiles/h-error.py
	./grun.sh MiniPython startfile testfiles/i-error.py
	./grun.sh MiniPython startfile testfiles/j-error.py
