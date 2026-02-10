# Notes

Notes for Jan 29th.

## Markdown

- set of rules for formatting plain text
- simpler than markup languages like HTML
- human readable without another program to "render" it
- some rules I use a lot:
  - hyphens make bulleted lists (like this one)
  - numbers can make numbered lists
  - pound signs (#) mark headers
  - backticks mark `code`, either inline or in a block:

```
this is a code block
it starts and ends with three backticks
```

## Geany

- ctrl + n creates a new file
- ctrl + s saves a file
- ctrl + o opens a file
- ctrl + w closes a tab

## Java

- the `java` command can run your java programs
- files:
  - plain text files contain nothing but text
  - binary files are files that contain things other than text (may still
    contain some text): images, audio, video, compiled code, word documents,
    pdfs
  - source code is plain text that represents code, readable/editable by humans
  - machine code is a binary format that your computer understands, not readable
    by humans
- compile, interpret, run
  - compile: convert source code to machine code ahead of time
  - interpret: convert source code to machine code as you run it
  - need to do one or the other to run your program on a computer
- java compilation: source code (.java) is converted to bytecode (.class) by the
  `javac` program, you can run compiled .class files with the `java` command
  - `javac MyProgram.java` creates `MyProgram.class`
  - `java MyProgram` runs `MyProgram.class`
  - `java MyProgram.java` compiles our code, saves the bytecode in RAM, and runs
    the bytecode
    - We'll use this method because it's simpler (one command) and doesn't leave
      a bunch of .class files everywhere
- can you read compiled code?
  - not really... but try it with `cat` and `less` (q to exit less)
- what is bytecode?
  - machine code for the Java Virtual Machine
  - Java programs are all run through the Java Virtual Machine
  - Java is kind of compiled and interpreted

See course website for git repo directions.
