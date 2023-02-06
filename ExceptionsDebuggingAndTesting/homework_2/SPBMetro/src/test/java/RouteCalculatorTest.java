import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class RouteCalculatorTest extends TestCase {

    List<Station> route;
    StationIndex stationIndex = new StationIndex();
    RouteCalculator routeCalculator = new RouteCalculator(stationIndex);


    @Override
    protected void setUp() throws Exception
    {
        route = new ArrayList<>();

        Line line1 = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");
        Line line3 = new Line(3, "Вторая");

        Station station1 = new Station("Петровская", line1);
        Station station2 = new Station("Александровская", line1);
        Station station3 = new Station("Ивановская", line1);
        Station station4 = new Station("Михайловская", line2);
        Station station5 = new Station("Кирилловская", line2);
        Station station6 = new Station("Андреевская", line2);
        Station station7 = new Station("Аэропорт", line2);
        Station station8 = new Station("Екатерининская", line3);
        Station station9 = new Station("Еленовская", line3);
        Station station10 = new Station("Пушкинская", line3);

        List<Station> connection = new ArrayList<>();
        List<Station> connection2 = new ArrayList<>();

        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);
        stationIndex.addStation(station1);
        stationIndex.addStation(station2);
        stationIndex.addStation(station3);
        stationIndex.addStation(station4);
        stationIndex.addStation(station5);
        stationIndex.addStation(station6);
        stationIndex.addStation(station7);
        stationIndex.addStation(station8);
        stationIndex.addStation(station9);
        stationIndex.addStation(station10);

        line1.addStation(station1);
        line1.addStation(station2);
        line1.addStation(station3);
        line2.addStation(station4);
        line2.addStation(station5);
        line2.addStation(station6);
        line2.addStation(station7);
        line3.addStation(station8);
        line3.addStation(station9);
        line3.addStation(station10);

        connection.add(station2);
        connection.add(station5);

        connection2.add(station6);
        connection2.add(station9);

        stationIndex.addConnection(connection);
        stationIndex.addConnection(connection2);

        route.add(station1);
        route.add(station2);
        route.add(station3);
        route.add(station4);
        route.add(station5);
        route.add(station6);
    }

    public void testCalculateDuration()
    {
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 13.5;
        assertEquals(expected, actual);
    }

    public void testGetShortestRoute()
    {
        List<Station> actual = routeCalculator.getShortestRoute(stationIndex.getStation("Петровская"), stationIndex.getStation("Ивановская"));

        List<Station> expected = new ArrayList<>();
        expected.add(stationIndex.getStation("Петровская"));
        expected.add(stationIndex.getStation("Александровская"));
        expected.add(stationIndex.getStation("Ивановская"));

        assertEquals(expected, actual);
    }

    public void testGetRouteWithOneConnection()
    {
        List<Station> actual = routeCalculator.getShortestRoute(stationIndex.getStation("Петровская"), stationIndex.getStation("Андреевская"));

        List<Station> expected = new ArrayList<>();
        expected.add(stationIndex.getStation("Петровская"));
        expected.add(stationIndex.getStation("Александровская"));
        expected.add(stationIndex.getStation("Кирилловская"));
        expected.add(stationIndex.getStation("Андреевская"));

        assertEquals(expected, actual);
    }

    public void testGetRouteWithTwoConnection()
    {
        List<Station> actual = routeCalculator.getShortestRoute(stationIndex.getStation("Петровская"), stationIndex.getStation("Пушкинская"));

        List<Station> expected = new ArrayList<>();
        expected.add(stationIndex.getStation("Петровская"));
        expected.add(stationIndex.getStation("Александровская"));
        expected.add(stationIndex.getStation("Кирилловская"));
        expected.add(stationIndex.getStation("Андреевская"));
        expected.add(stationIndex.getStation("Еленовская"));
        expected.add(stationIndex.getStation("Пушкинская"));

        assertEquals(expected, actual);
    }

    @Override
    protected void tearDown() throws Exception
    {

    }


}
