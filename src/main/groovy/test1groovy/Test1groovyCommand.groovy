package test1groovy

import io.micronaut.configuration.picocli.PicocliRunner
import io.micronaut.context.ApplicationContext

import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Option
import picocli.CommandLine.Parameters

@Command(name = 'test1groovy', description = '...',
        mixinStandardHelpOptions = true)
class Test1groovyCommand implements Runnable {

    @Option(names = ['-v', '--verbose'], description = '...')
    boolean verbose

    static void main(String[] args) throws Exception {
        PicocliRunner.run(Test1groovyCommand.class, args)
    }

    void run() {
        // business logic here
        if (verbose) {
            println "Hi jim !"
        }
    }
}
