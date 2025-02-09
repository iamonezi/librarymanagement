USE [master]
GO
/****** Object:  Database [dbLibraries]    Script Date: 17/07/2022 8:35:28 PM ******/
CREATE DATABASE [dbLibraries]

ALTER DATABASE [dbLibraries] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [dbLibraries].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [dbLibraries] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [dbLibraries] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [dbLibraries] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [dbLibraries] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [dbLibraries] SET ARITHABORT OFF 
GO
ALTER DATABASE [dbLibraries] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [dbLibraries] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [dbLibraries] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [dbLibraries] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [dbLibraries] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [dbLibraries] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [dbLibraries] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [dbLibraries] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [dbLibraries] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [dbLibraries] SET  DISABLE_BROKER 
GO
ALTER DATABASE [dbLibraries] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [dbLibraries] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [dbLibraries] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [dbLibraries] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [dbLibraries] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [dbLibraries] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [dbLibraries] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [dbLibraries] SET RECOVERY FULL 
GO
ALTER DATABASE [dbLibraries] SET  MULTI_USER 
GO
ALTER DATABASE [dbLibraries] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [dbLibraries] SET DB_CHAINING OFF 
GO
ALTER DATABASE [dbLibraries] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [dbLibraries] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [dbLibraries] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [dbLibraries] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'dbLibraries', N'ON'
GO
ALTER DATABASE [dbLibraries] SET QUERY_STORE = OFF
GO
USE [dbLibraries]
GO
/****** Object:  Table [dbo].[author]    Script Date: 17/07/2022 8:35:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[author](
	[ID_author] [int] IDENTITY(1,1) NOT NULL,
	[author_name] [nvarchar](200) NULL,
 CONSTRAINT [pk_ID_author] PRIMARY KEY CLUSTERED 
(
	[ID_author] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[book]    Script Date: 17/07/2022 8:35:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[book](
	[ID_book] [int] IDENTITY(1,1) NOT NULL,
	[ID_publisher] [int] NULL,
	[ID_author] [int] NULL,
	[img] [nvarchar](200) NULL,
	[book_name] [nvarchar](100) NULL,
	[language] [nvarchar](100) NULL,
	[type] [nvarchar](100) NULL,
	[publishing_year] [int] NULL,
	[amount] [int] NULL,
	[available] [bit] NULL,
 CONSTRAINT [pk_ID_book] PRIMARY KEY CLUSTERED 
(
	[ID_book] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[borrow_bill]    Script Date: 17/07/2022 8:35:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[borrow_bill](
	[ID_borrow_bill] [int] IDENTITY(1,1) NOT NULL,
	[ID_book] [int] NULL,
	[ID_user] [int] NULL,
	[Date_get] [nvarchar](50) NULL,
	[Date_return] [nvarchar](50) NULL,
	[check_get] [bit] NULL,
	[check_return] [bit] NULL,
	[ID_librarian] [int] NULL,
	[NumBookGet] [int] NULL,
	[NumBookReturn] [int] NULL,
 CONSTRAINT [pk_ID_borrow_bill] PRIMARY KEY CLUSTERED 
(
	[ID_borrow_bill] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[librarian]    Script Date: 17/07/2022 8:35:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[librarian](
	[ID_librarian] [int] IDENTITY(1,1) NOT NULL,
	[USERNAME] [nvarchar](100) NULL,
	[PASSWORD] [nvarchar](100) NULL,
	[fullName] [nvarchar](100) NULL,
	[phone] [nvarchar](20) NULL,
	[citizen_identity_card] [int] NULL,
	[address] [nvarchar](200) NULL,
	[mail] [nvarchar](100) NULL,
	[salary] [int] NULL,
 CONSTRAINT [pk_librarian] PRIMARY KEY CLUSTERED 
(
	[ID_librarian] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[publisher]    Script Date: 17/07/2022 8:35:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[publisher](
	[ID_publisher] [int] IDENTITY(1,1) NOT NULL,
	[publisher_name] [nvarchar](200) NULL,
 CONSTRAINT [pk_ID_publisher] PRIMARY KEY CLUSTERED 
(
	[ID_publisher] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[user]    Script Date: 17/07/2022 8:35:28 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[user](
	[ID_user] [int] IDENTITY(1,1) NOT NULL,
	[fullName] [nvarchar](100) NULL,
	[phone] [int] NULL,
	[citizen_identity_card] [nvarchar](20) NULL,
	[address] [nvarchar](100) NULL,
	[mail] [nvarchar](100) NULL,
	[USERNAME] [nvarchar](100) NULL,
	[PASSWORD] [nvarchar](100) NULL,
 CONSTRAINT [pk_user] PRIMARY KEY CLUSTERED 
(
	[ID_user] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[author] ON 

INSERT [dbo].[author] ([ID_author], [author_name]) VALUES (1, N'Robert M. Pirsig')
INSERT [dbo].[author] ([ID_author], [author_name]) VALUES (2, N'Richard Adams')
INSERT [dbo].[author] ([ID_author], [author_name]) VALUES (3, N'Bill Bryson')
INSERT [dbo].[author] ([ID_author], [author_name]) VALUES (4, N'Viktor E. Frankl')
INSERT [dbo].[author] ([ID_author], [author_name]) VALUES (5, N'Joe Haldeman')
INSERT [dbo].[author] ([ID_author], [author_name]) VALUES (6, N'Herman Melville')
INSERT [dbo].[author] ([ID_author], [author_name]) VALUES (7, N'Ernest Hemingway')
INSERT [dbo].[author] ([ID_author], [author_name]) VALUES (8, N'Kafka on the Shore')
INSERT [dbo].[author] ([ID_author], [author_name]) VALUES (9, N'N''Antoine de Saint-Exupéry')
INSERT [dbo].[author] ([ID_author], [author_name]) VALUES (10, N'Cormac McCarthy')
INSERT [dbo].[author] ([ID_author], [author_name]) VALUES (11, N'11')
INSERT [dbo].[author] ([ID_author], [author_name]) VALUES (12, N'111')
SET IDENTITY_INSERT [dbo].[author] OFF
GO
SET IDENTITY_INSERT [dbo].[book] ON 

INSERT [dbo].[book] ([ID_book], [ID_publisher], [ID_author], [img], [book_name], [language], [type], [publishing_year], [amount], [available]) VALUES (1, 1, 1, N'https://images-na.ssl-images-amazon.com/images/I/71tZgyVVbfL.jpg', N'Zen and the Art of Motorcycle Maintenance', N'English', N'Philosophical fiction, Autobiographical novel', 1974, 1, 1)
INSERT [dbo].[book] ([ID_book], [ID_publisher], [ID_author], [img], [book_name], [language], [type], [publishing_year], [amount], [available]) VALUES (2, 2, 2, N'https://flxt.tmsimg.com/assets/p7221_p_v11_ac.jpg', N'Watership Down', N'English', N'Fantasy', 1972, 3, 1)
INSERT [dbo].[book] ([ID_book], [ID_publisher], [ID_author], [img], [book_name], [language], [type], [publishing_year], [amount], [available]) VALUES (3, 3, 3, N'https://salt.tikicdn.com/cache/400x400/ts/product/b6/24/26/91f69b0a7f8abd68084e5c14f69376c1.jpg', N'A Short History of Nearly Everything', N'English', N'Non-fiction', 2003, 2, 1)
INSERT [dbo].[book] ([ID_book], [ID_publisher], [ID_author], [img], [book_name], [language], [type], [publishing_year], [amount], [available]) VALUES (4, 4, 4, N'https://images-na.ssl-images-amazon.com/images/I/819Pl1nP0ZL.jpg', N'Man''s Search for Meaning', N'German', N'Psychology', 1946, 2, 1)
INSERT [dbo].[book] ([ID_book], [ID_publisher], [ID_author], [img], [book_name], [language], [type], [publishing_year], [amount], [available]) VALUES (5, 5, 5, N'https://cdn-amz.woka.io/images/I/A1Zipt0G2kL.jpg', N'The Forever War', N'English', N'Military science fiction', 1974, 4, 1)
INSERT [dbo].[book] ([ID_book], [ID_publisher], [ID_author], [img], [book_name], [language], [type], [publishing_year], [amount], [available]) VALUES (6, 6, 6, N'https://m.media-amazon.com/images/I/51uZAazEVuL.jpg', N'Bartleby The Scrivener: A Story of Wall-Street', N'English', N'Short story', 1853, 1, 1)
INSERT [dbo].[book] ([ID_book], [ID_publisher], [ID_author], [img], [book_name], [language], [type], [publishing_year], [amount], [available]) VALUES (7, 7, 7, N'https://images-na.ssl-images-amazon.com/images/I/81VzVpbAACL.jpg', N'For Whom the Bell Tolls', N'English', N'War novel', 1940, 3, 1)
INSERT [dbo].[book] ([ID_book], [ID_publisher], [ID_author], [img], [book_name], [language], [type], [publishing_year], [amount], [available]) VALUES (8, 8, 8, N'https://bizweb.dktcdn.net/100/326/228/products/kafkaontheshoreharukimurakami6.jpg?v=1546509906120', N'Kafka on the Shore', N'Japanese', N'Magical realism', 2002, 3, 1)
INSERT [dbo].[book] ([ID_book], [ID_publisher], [ID_author], [img], [book_name], [language], [type], [publishing_year], [amount], [available]) VALUES (9, 9, 9, N'https://cdn-amz.woka.io/images/I/71OZY035QKL.jpg', N'The Little Prince', N'French', N'Novella', 1943, 2, 1)
INSERT [dbo].[book] ([ID_book], [ID_publisher], [ID_author], [img], [book_name], [language], [type], [publishing_year], [amount], [available]) VALUES (10, 10, 10, N'https://images-na.ssl-images-amazon.com/images/I/71IJ1HC2a3L.jpg', N'The Road', N'English', N'Post-apocalyptic fiction
        Tragedy', 2006, 4, 1)
INSERT [dbo].[book] ([ID_book], [ID_publisher], [ID_author], [img], [book_name], [language], [type], [publishing_year], [amount], [available]) VALUES (25, 12, 12, N'111', N'111', N'111', N'111', 111, 111, 1)
SET IDENTITY_INSERT [dbo].[book] OFF
GO
SET IDENTITY_INSERT [dbo].[borrow_bill] ON 
SET IDENTITY_INSERT [dbo].[borrow_bill] OFF
GO
SET IDENTITY_INSERT [dbo].[librarian] ON 

INSERT [dbo].[librarian] ([ID_librarian], [USERNAME], [PASSWORD], [fullName], [phone], [citizen_identity_card], [address], [mail], [salary]) VALUES (1, N'admin01', N'1111', N'Trần Văn Tới', N'0376564523', 385827945, N'Bac Lieu', N'poqmmpoq@gmail.com', 200)
INSERT [dbo].[librarian] ([ID_librarian], [USERNAME], [PASSWORD], [fullName], [phone], [citizen_identity_card], [address], [mail], [salary]) VALUES (2, N'admin02', N'2222', N'Võ Việt Nhân', NULL, NULL, NULL, NULL, NULL)
INSERT [dbo].[librarian] ([ID_librarian], [USERNAME], [PASSWORD], [fullName], [phone], [citizen_identity_card], [address], [mail], [salary]) VALUES (3, N'admin03', N'3333', NULL, NULL, NULL, NULL, NULL, NULL)
INSERT [dbo].[librarian] ([ID_librarian], [USERNAME], [PASSWORD], [fullName], [phone], [citizen_identity_card], [address], [mail], [salary]) VALUES (4, N'admin04', N'4444', NULL, NULL, NULL, NULL, NULL, NULL)
INSERT [dbo].[librarian] ([ID_librarian], [USERNAME], [PASSWORD], [fullName], [phone], [citizen_identity_card], [address], [mail], [salary]) VALUES (5, N'admin05', N'5555', NULL, NULL, NULL, NULL, NULL, NULL)
INSERT [dbo].[librarian] ([ID_librarian], [USERNAME], [PASSWORD], [fullName], [phone], [citizen_identity_card], [address], [mail], [salary]) VALUES (6, N'admin06', N'6666', NULL, NULL, NULL, NULL, NULL, NULL)
INSERT [dbo].[librarian] ([ID_librarian], [USERNAME], [PASSWORD], [fullName], [phone], [citizen_identity_card], [address], [mail], [salary]) VALUES (7, N'admin07', N'7777', NULL, NULL, NULL, NULL, NULL, NULL)
SET IDENTITY_INSERT [dbo].[librarian] OFF
GO
SET IDENTITY_INSERT [dbo].[publisher] ON 

INSERT [dbo].[publisher] ([ID_publisher], [publisher_name]) VALUES (1, N'William Morrow and Company')
INSERT [dbo].[publisher] ([ID_publisher], [publisher_name]) VALUES (2, N'Rex Collings')
INSERT [dbo].[publisher] ([ID_publisher], [publisher_name]) VALUES (3, N'Doubleday')
INSERT [dbo].[publisher] ([ID_publisher], [publisher_name]) VALUES (4, N'Verlag für Jugend und Volk')
INSERT [dbo].[publisher] ([ID_publisher], [publisher_name]) VALUES (5, N'St. Martin''''s Press')
INSERT [dbo].[publisher] ([ID_publisher], [publisher_name]) VALUES (6, N'Putnam''''s Magazine')
INSERT [dbo].[publisher] ([ID_publisher], [publisher_name]) VALUES (7, N'Charles Scribner''''s Sons')
INSERT [dbo].[publisher] ([ID_publisher], [publisher_name]) VALUES (8, N'Magical realism'', N''Shinchosha')
INSERT [dbo].[publisher] ([ID_publisher], [publisher_name]) VALUES (9, N'Reynal & Hitchcock')
INSERT [dbo].[publisher] ([ID_publisher], [publisher_name]) VALUES (10, N'Alfred A. Knopf')
INSERT [dbo].[publisher] ([ID_publisher], [publisher_name]) VALUES (11, N'11')
INSERT [dbo].[publisher] ([ID_publisher], [publisher_name]) VALUES (12, N'111')
SET IDENTITY_INSERT [dbo].[publisher] OFF
GO
SET IDENTITY_INSERT [dbo].[user] ON 

INSERT [dbo].[user] ([ID_user], [fullName], [phone], [citizen_identity_card], [address], [mail], [USERNAME], [PASSWORD]) VALUES (1, N'Trần Văn Tới', 376564523, N'385827945', N'Bac Lieu', N'poqmmpoq@gmail.com', N'petoicute', N'123456')
INSERT [dbo].[user] ([ID_user], [fullName], [phone], [citizen_identity_card], [address], [mail], [USERNAME], [PASSWORD]) VALUES (2, N'Phạm Minh Thư', 382600711, N'342023557', N'Dong Thap', N'thupmce160468@fpt.edu.vn', N'minhthu', N'123456')
INSERT [dbo].[user] ([ID_user], [fullName], [phone], [citizen_identity_card], [address], [mail], [USERNAME], [PASSWORD]) VALUES (3, N'Võ Việt Nhân', 321810054, N'949180802', N'Ben Tre', N'nhanvvce160937@f[t.edu.vn', N'nhanvv', N'123456')
INSERT [dbo].[user] ([ID_user], [fullName], [phone], [citizen_identity_card], [address], [mail], [USERNAME], [PASSWORD]) VALUES (4, N'Nguyễn Đức Tài', 939765749, N'342009425', N'Dong Thap', N'dutaen1011@gmail.com', N'taind', N'123456')
SET IDENTITY_INSERT [dbo].[user] OFF
GO
ALTER TABLE [dbo].[book] ADD  DEFAULT ((1)) FOR [available]
GO
ALTER TABLE [dbo].[borrow_bill] ADD  DEFAULT ((0)) FOR [check_get]
GO
ALTER TABLE [dbo].[borrow_bill] ADD  DEFAULT ((0)) FOR [check_return]
GO
ALTER TABLE [dbo].[book]  WITH CHECK ADD  CONSTRAINT [fk_author] FOREIGN KEY([ID_author])
REFERENCES [dbo].[author] ([ID_author])
GO
ALTER TABLE [dbo].[book] CHECK CONSTRAINT [fk_author]
GO
ALTER TABLE [dbo].[book]  WITH CHECK ADD  CONSTRAINT [fk_publisher] FOREIGN KEY([ID_publisher])
REFERENCES [dbo].[publisher] ([ID_publisher])
GO
ALTER TABLE [dbo].[book] CHECK CONSTRAINT [fk_publisher]
GO
ALTER TABLE [dbo].[borrow_bill]  WITH CHECK ADD  CONSTRAINT [fk_book] FOREIGN KEY([ID_book])
REFERENCES [dbo].[book] ([ID_book])
GO
ALTER TABLE [dbo].[borrow_bill] CHECK CONSTRAINT [fk_book]
GO
ALTER TABLE [dbo].[borrow_bill]  WITH CHECK ADD  CONSTRAINT [fk_librarian] FOREIGN KEY([ID_librarian])
REFERENCES [dbo].[librarian] ([ID_librarian])
GO
ALTER TABLE [dbo].[borrow_bill] CHECK CONSTRAINT [fk_librarian]
GO
ALTER TABLE [dbo].[borrow_bill]  WITH CHECK ADD  CONSTRAINT [fk_user] FOREIGN KEY([ID_user])
REFERENCES [dbo].[user] ([ID_user])
GO
ALTER TABLE [dbo].[borrow_bill] CHECK CONSTRAINT [fk_user]
GO
USE [master]
GO
ALTER DATABASE [dbLibraries] SET  READ_WRITE 
GO
