PROJET= competition 

doc:
	javadoc -cp src competition1 -d docs
	firefox docs/index.html
	javadoc -cp src competition1.observer -d docs
	firefox docs/index.html
	javadoc -cp src competition1.strategy -d docs
	firefox docs/index.html

run: runCompetitor runNotRightNumberException runMatch runIo runMapUtil runCompetition runLeague runTournament runMaster runObserver runStrategy runMainV1 runMainV2 runMainV3


mainV3:
	java -classpath classes competition1.MainV3

mainV2:
	java -classpath classes competition1.MainV2 

mainV1:
	java -classpath classes competition1.MainV1 

runMainV3:
	cd src; javac competition1/MainV3.java -d ../classes; cd ..

runMainV2:
	cd src; javac competition1/MainV2.java -d ../classes; cd ..

runMainV1:
	cd src; javac competition1/MainV1.java -d ../classes; cd ..

MapUtil:
	java -classpath classes competition1.MapUtil

runIo:
	cd src; javac io/Input.java -d ../classes; cd ..

runMapUtil:
	cd src; javac competition1/MapUtil.java -d ../classes; cd ..

runCompetition:
	cd src; javac competition1/Competition.java -d ../classes; cd ..

runCompetitor:
	cd src; javac competition1/Competitor.java -d ../classes; cd ..

runNotRightNumberException:
	cd src; javac competition1/NotRightNumberException.java -d ../classes; cd ..

runMatch:
	cd src; javac competition1/Match.java -d ../classes; cd ..

runLeague:
	cd src; javac competition1/League.java -d ../classes; cd ..

runTournament:
	cd src; javac competition1/Tournament.java -d ../classes; cd ..

runObservable:
	cd src; javac competition1/Observable.java -d ../classes; cd ..

runObserverJournalist:
	cd src; javac competition1/observer/Journalist.java -d ../classes; cd ..

runObserverGambler:
	cd src; javac competition1/observer/Gambler.java -d ../classes; cd ..

runObserverObservers:
	cd src; javac competition1/observer/Observers.java -d ../classes; cd ..

runObserver: runObserverJournalist runObserverGambler runObserverObservers
	
runMaster:
	cd src; javac competition1/Master.java -d ../classes; cd ..

runStrategy: runAStrategy runStrategyClass runStrategyEnum runStrategyFirst runStrategyFirst2 runStrategyRandom runStrategyRepechage

runStrategyClass:
	cd src; javac competition1/strategy/Strategy.java -d ../classes; cd ..

runAStrategy:
	cd src; javac competition1/strategy/AStrategy.java -d ../classes; cd ..

runStrategyEnum:
	cd src; javac competition1/strategy/StrategyEnum.java -d ../classes; cd ..

runStrategyFirst:
	cd src; javac competition1/strategy/StrategyFirst.java -d ../classes; cd ..

runStrategyFirst2:
	cd src; javac competition1/strategy/StrategyFirst2.java -d ../classes; cd ..

runStrategyRandom:
	cd src; javac competition1/strategy/StrategyRandom.java -d ../classes; cd ..

runStrategyRepechage:
	cd src; javac competition1/strategy/StrategyRepechageLast.java -d ../classes; cd ..

TestAll: TestCompetition TestCompetitor TestMatch TestLeague TestTournament

TestCompetition:
	javac -classpath test-1.7.jar test/competition1/CompetitionTest.java -d classes
	java -jar test-1.7.jar competition1.CompetitionTest

TestCompetitor:
	javac -classpath test-1.7.jar test/competition1/CompetitorTest.java -d classes
	java -jar test-1.7.jar competition1.CompetitorTest

TestMatch:
	javac -classpath test-1.7.jar test/competition1/MatchTest.java -d classes
	java -jar test-1.7.jar competition1.MatchTest

TestLeague:
	javac -classpath test-1.7.jar test/competition1/LeagueTest.java -d classes
	java -jar test-1.7.jar competition1.LeagueTest

TestTournament:
	javac -classpath test-1.7.jar test/competition1/TournamentTest.java -d classes
	java -jar test-1.7.jar competition1.TournamentTest

TestMaster:
	javac -classpath test-1.7.jar test/competition1/MasterTest.java -d classes
	java -jar test-1.7.jar competition1.MasterTest



jarGame:
	touch manifest-ex
	echo "Main-Class: competition1.Main" > manifest-ex ;
	jar cvfm competition.jar manifest-ex -C classes competition1


Execute:
	java -jar competition.jar


clean:
	rm -rf classes/competition1/ classes/io/
	rm -rf competition1/bin
	rm -f test/*.class appli*
	rm -rf docs
	rm -rf .project
	rm -rf .classpath
	clear
