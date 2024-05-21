public class ArtWork {
    public void draw(int artNo) {
        String figure = "";

            if (artNo == 1) {
            figure = """

                    888       888          888                                               \s
                    888   o   888          888                                               \s
                    888  d8b  888          888                                               \s
                    888 d888b 888  .d88b.  888  .d8888b  .d88b.  88888b.d88b.   .d88b.       \s
                    888d88888b888 d8P  Y8b 888 d88P"    d88""88b 888 "888 "88b d8P  Y8b      \s
                    88888P Y88888 88888888 888 888      888  888 888  888  888 88888888      \s
                    8888P   Y8888 Y8b.     888 Y88b.    Y88..88P 888  888  888 Y8b.          \s
                    888P     Y888  "Y8888  888  "Y8888P  "Y88P"  888  888  888  "Y8888       \s
                                                                                             \s
                                                                                             \s
                                                                                             \s
                    """;
        } else if (artNo == 2) {
            figure = """
                .d8888. d88888b d888888b d888888b d888888b d8b   db  d888b  .d8888.      \s
                88'  YP 88'     `~~88~~' `~~88~~'   `88'   888o  88 88' Y8b 88'  YP      \s
                `8bo.   88ooooo    88       88       88    88V8o 88 88      `8bo.        \s
                  `Y8b. 88~~~~~    88       88       88    88 V8o88 88  ooo   `Y8b.      \s
                db   8D 88.        88       88      .88.   88  V888 88. ~8~ db   8D      \s
                `8888Y' Y88888P    YP       YP    Y888888P VP   V8P  Y888P  `8888Y'      \s
                    """;
        }
        System.out.println(figure);
    }
}
